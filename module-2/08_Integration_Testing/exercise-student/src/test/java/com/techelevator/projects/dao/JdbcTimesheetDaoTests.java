package com.techelevator.projects.dao;

import com.techelevator.projects.model.Timesheet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.verification.Times;

import java.sql.Time;
import java.time.LocalDate;
import java.util.List;

public class JdbcTimesheetDaoTests extends BaseDaoTests {

    private static final Timesheet TIMESHEET_1 = new Timesheet(1L, 1L, 1L, 
            LocalDate.parse("2021-01-01"), 1.0, true, "Timesheet 1");
    private static final Timesheet TIMESHEET_2 = new Timesheet(2L, 1L, 1L,
            LocalDate.parse("2021-01-02"), 1.5, true, "Timesheet 2");
    private static final Timesheet TIMESHEET_3 = new Timesheet(3L, 2L, 1L,
            LocalDate.parse("2021-01-01"), 0.25, true, "Timesheet 3");
    private static final Timesheet TIMESHEET_4 = new Timesheet(4L, 2L, 2L,
            LocalDate.parse("2021-02-01"), 2.0, false, "Timesheet 4");
    
    private JdbcTimesheetDao sut;


    @Before
    public void setup() {
        sut = new JdbcTimesheetDao(dataSource);
    }

    @Test
    public void getTimesheet_returns_correct_timesheet_for_id() {
        Timesheet timesheet = sut.getTimesheet(1L);
        assertTimesheetsMatch(TIMESHEET_1, timesheet);

        Timesheet timesheet2 = sut.getTimesheet(2L);
        assertTimesheetsMatch(TIMESHEET_2, timesheet2);

        Timesheet timesheet3 = sut.getTimesheet(3L);
        assertTimesheetsMatch(TIMESHEET_3, timesheet3);

        Timesheet timesheet4 = sut.getTimesheet(4L);
        assertTimesheetsMatch(TIMESHEET_4, timesheet4);

    }

    @Test
    public void getTimesheet_returns_null_when_id_not_found() {
        Timesheet shouldBeNull = sut.getTimesheet(-1L);
        Assert.assertNull(shouldBeNull);
    }

    @Test
    public void getTimesheetsByEmployeeId_returns_list_of_all_timesheets_for_employee() {
        List<Timesheet> timesheet = sut.getTimesheetsByEmployeeId(1L);
        Assert.assertNotNull(timesheet);
        Assert.assertEquals(2, timesheet.size());

        List<Timesheet> timesheet2 = sut.getTimesheetsByEmployeeId(2L);
        Assert.assertNotNull(timesheet2);
        Assert.assertEquals(2, timesheet2.size());
    }

    @Test
    public void getTimesheetsByProjectId_returns_list_of_all_timesheets_for_project() {
        List<Timesheet> timesheet = sut.getTimesheetsByProjectId(1L);
        Assert.assertNotNull(timesheet);
        Assert.assertEquals(3, timesheet.size());

        List<Timesheet> timesheet2 = sut.getTimesheetsByProjectId(2L);
        Assert.assertNotNull(timesheet2);
        Assert.assertEquals(1, timesheet2.size());
    }

    @Test
    public void createTimesheet_returns_timesheet_with_id_and_expected_values() {
        Timesheet testTimesheet = new Timesheet(-999L, 1L, 1L,
                LocalDate.parse("2021-01-01"), 1.0, true, "Timesheet -999");
        Timesheet createdTimesheet = sut.createTimesheet(testTimesheet);

        long newId = createdTimesheet.getTimesheetId();
        Assert.assertTrue(newId > 0);

        testTimesheet.setTimesheetId(newId);
        assertTimesheetsMatch(testTimesheet, createdTimesheet);
    }

    @Test
    public void created_timesheet_has_expected_values_when_retrieved() {
        Timesheet testTimesheet = new Timesheet(-999L, 1L, 1L,
                LocalDate.parse("2021-01-01"), 1.0, true, "Timesheet -999");
        Timesheet createdTimesheet = sut.createTimesheet(testTimesheet);

        long newId = createdTimesheet.getTimesheetId();
        Assert.assertTrue(newId > 0);

        testTimesheet.setTimesheetId(newId);
        assertTimesheetsMatch(testTimesheet, createdTimesheet);
    }

    @Test
    public void updated_timesheet_has_expected_values_when_retrieved() {
        Timesheet timesheetToUpdate = sut.getTimesheet(1L);

        timesheetToUpdate.setBillable(false);
        timesheetToUpdate.setDateWorked(LocalDate.parse("1980-06-05"));
        timesheetToUpdate.setDescription("What even are we doing this for?");
        timesheetToUpdate.setEmployeeId(2L);
        timesheetToUpdate.setHoursWorked(2.0);
        timesheetToUpdate.setProjectId(2L);

        sut.updateTimesheet(timesheetToUpdate);

        Timesheet retrievedTimesheet = sut.getTimesheet(1L);
        assertTimesheetsMatch(retrievedTimesheet, timesheetToUpdate);
    }

    @Test
    public void deleted_timesheet_cant_be_retrieved() {
        sut.deleteTimesheet(1L);

        Timesheet retrievedTimesheet = sut.getTimesheet(1L);

        Assert.assertNull(retrievedTimesheet);

        List<Timesheet> timesheets = sut.getTimesheetsByProjectId(1L);
        Assert.assertEquals(2, timesheets.size());
        assertTimesheetsMatch(TIMESHEET_2, timesheets.get(0));

    }

    @Test
    public void getBillableHours_returns_correct_total() {
        double billableHours = sut.getBillableHours(1L, 1L);
        Assert.assertEquals(2.5, billableHours, .1);

        double billableHours2 = sut.getBillableHours(2L, 1L);
        Assert.assertEquals(.25, billableHours2, .1);

        double billableHours3 = sut.getBillableHours(2L, 2L);
        Assert.assertEquals(0.0, billableHours3, .1);
    }

    private void assertTimesheetsMatch(Timesheet expected, Timesheet actual) {
        Assert.assertEquals(expected.getTimesheetId(), actual.getTimesheetId());
        Assert.assertEquals(expected.getEmployeeId(), actual.getEmployeeId());
        Assert.assertEquals(expected.getProjectId(), actual.getProjectId());
        Assert.assertEquals(expected.getDateWorked(), actual.getDateWorked());
        Assert.assertEquals(expected.getHoursWorked(), actual.getHoursWorked(), 0.001);
        Assert.assertEquals(expected.isBillable(), actual.isBillable());
        Assert.assertEquals(expected.getDescription(), actual.getDescription());
    }

}
