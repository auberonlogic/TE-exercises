package com.techelevator.dao;

import com.techelevator.model.State;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcStateDao implements StateDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcStateDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public State getState(String stateAbbreviation) {
        State state = null;
        String sql = "SELECT state_abbreviation, state_name, state_nickname FROM state WHERE state_abbreviation = ?;";
        if (stateAbbreviation != null && !stateAbbreviation.isEmpty()) {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, stateAbbreviation);
            if (results.next()) {
                state = mapRowToState(results);
            }
        }
        return state;
    }

    @Override
    public State getStateByCapital(long cityId) {
        State state = null;
        String sql = "SELECT state_abbreviation, state_name, state nick_name FROM state WHERE capital = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, cityId);
        if (results.next()) {
            state = mapRowToState(results);
        }
        return state;
    }

    @Override
    public List<State> getStates() {
        List<State> states = new ArrayList<>();
        SqlRowSet results = jdbcTemplate.queryForRowSet("SELECT state_abbreviation, state_name, state_nickname FROM state;");
        while (results.next()) {
            states.add(mapRowToState(results));
        }
        return states;
    }

    private State mapRowToState(SqlRowSet rowSet) {
        State state = new State();
        state.setStateAbbreviation(rowSet.getString("state_abbreviation"));

        // COME BACK TO THIS
        String stateName = rowSet.getString("state_name");
        if (stateName != null); {
            state.setStateName(rowSet.getString("state_name").toUpperCase());
        }
        String nick = rowSet.getString("state_nickname");
        if (nick != null); {
            state.setNickname(rowSet.getString("state_nickname").toUpperCase());
        }
        return state;
    }
}