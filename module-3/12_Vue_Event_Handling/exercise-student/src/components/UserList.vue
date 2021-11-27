<template>
  <div class="container">
    <table id="tblUsers">
      <thead>
        <tr>
          <th>&nbsp;</th>
          <th>First Name</th>
          <th>Last Name</th>
          <th>Username</th>
          <th>Email Address</th>
          <th>Status</th>
          <th>Actions</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>
            <!-- ADDED checkboxWorking click event method call to debug -->
            <input type="checkbox" id="selectAll" @click="checkAll" :checked="users.length === selectedUserIDs.length && users.length > 0" />
          </td>
          <td>
            <input type="text" id="firstNameFilter" v-model="filter.firstName" />
          </td>
          <td>
            <input type="text" id="lastNameFilter" v-model="filter.lastName" />
          </td>
          <td>
            <input type="text" id="usernameFilter" v-model="filter.username" />
          </td>
          <td>
            <input type="text" id="emailFilter" v-model="filter.emailAddress" />
          </td>
          <td>
            <select id="statusFilter" v-model="filter.status">
              <option value>Show All</option>
              <option value="Active">Active</option>
              <option value="Disabled">Disabled</option>
            </select>
          </td>
          <td>&nbsp;</td>
        </tr>
        <tr
          v-for="user in filteredList"
          v-bind:key="user.id"
          v-bind:class="{ disabled: user.status === 'Disabled' }"
        >
          <td>
            <!-- ADDED checkboxWorking click event method call to debug -->
            <input type="checkbox" @click="toggleSelectedUser(user.id)" v-bind:id="user.id" v-bind:value="user.id" :checked="selectedUserIDs.includes(user.id)" />
          </td>
          <td>{{ user.firstName }}</td>
          <td>{{ user.lastName }}</td>
          <td>{{ user.username }}</td>
          <td>{{ user.emailAddress }}</td>
          <td>{{ user.status }}</td>
          <td>
            <button class="btnEnableDisable" v-on:click.prevent="flipStatus(user.id)" v-if="user.status === 'Active'">Disable</button>
            <button class="btnEnableDisable" v-on:click.prevent="flipStatus(user.id)" v-else>Enable</button>
          </td>
        </tr>
      </tbody>
    </table>

    <div class="all-actions" >
      <button :disabled="actionButtonDisabled" @click="enableSelectedUsers" >Enable Users</button>
      <button :disabled="actionButtonDisabled" @click="disableSelectedUsers" >Disable Users</button>
      <button :disabled="actionButtonDisabled" @click="deleteSelectedUsers" >Delete Users</button>
    </div>

    <button v-on:click.prevent="showForm === true ? showForm = false : showForm = true">Add New User</button>

    <form id="frmAddNewUser" v-show="showForm === true">
      <div class="field">
        <label for="firstName">First Name:</label>
        <input type="text" name="firstName" v-model="newUser.firstName" />
      </div>
      <div class="field">
        <label for="lastName">Last Name:</label>
        <input type="text" name="lastName" v-model="newUser.lastName" />
      </div>
      <div class="field">
        <label for="username">Username:</label>
        <input type="text" name="username" v-model="newUser.username" />
      </div>
      <div class="field">
        <label for="emailAddress">Email Address:</label>
        <input type="text" name="emailAddress" v-model="newUser.emailAddress" />
      </div>
      <button type="submit" class="btn save" v-on:click.prevent="saveUser">Save User</button>
    </form>
  </div>
</template>

<script>
export default {
  name: "user-list",
  
  data() {
    return {
      selectedUserIDs: [],
      showForm: false,
      filter: {
        firstName: "",
        lastName: "",
        username: "",
        emailAddress: "",
        status: ""
      },
      newUser: {
        id: null,
        firstName: "",
        lastName: "",
        username: "",
        emailAddress: "",
        status: "Active"
      },
      users: [
        {
          id: 1,
          firstName: "John",
          lastName: "Smith",
          username: "jsmith",
          emailAddress: "jsmith@gmail.com",
          status: "Active"
        },
        {
          id: 2,
          firstName: "Anna",
          lastName: "Bell",
          username: "abell",
          emailAddress: "abell@yahoo.com",
          status: "Active"
        },
        {
          id: 3,
          firstName: "George",
          lastName: "Best",
          username: "gbest",
          emailAddress: "gbest@gmail.com",
          status: "Disabled"
        },
        {
          id: 4,
          firstName: "Ben",
          lastName: "Carter",
          username: "bcarter",
          emailAddress: "bcarter@gmail.com",
          status: "Active"
        },
        {
          id: 5,
          firstName: "Katie",
          lastName: "Jackson",
          username: "kjackson",
          emailAddress: "kjackson@yahoo.com",
          status: "Active"
        },
        {
          id: 6,
          firstName: "Mark",
          lastName: "Smith",
          username: "msmith",
          emailAddress: "msmith@foo.com",
          status: "Disabled"
        }
      ],
    };
  },
  methods: {
    saveUser() {
      this.users.unshift(this.newUser);
      this.resetForm();
    },
    resetForm() {
      this.newUser =
      {
        id: null,
        firstName: "",
        lastName: "",
        username: "",
        emailAddress: "",
        status: "Active"
      }
    },
    flipStatus(id) {
      this.users.forEach( (user) => {
        if (user.id === id) {
          if (user.status === "Active") {
            user.status = "Disabled";
          } else {
            user.status = "Active"
          }
        }
      });
    },

    toggleSelectedUser(id) {
      if (this.selectedUserIDs.includes(id)) {
        let index = this.selectedUserIDs.indexOf(id);
        if (index > -1) {
          this.selectedUserIDs.splice(index, 1);
        }
        console.log(JSON.stringify(this.selectedUserIDs))
      } else {
        console.log('checkbox working');
        this.selectedUserIDs.unshift(id);
        console.log(JSON.stringify(this.selectedUserIDs))
      }
      
    },

    enableSelectedUsers() {
      this.users.forEach( (user) => {
        if (this.selectedUserIDs.includes(user.id)) {
          user.status = "Active";
          
        }
      });
      this.selectedUserIDs = [];
    },

    disableSelectedUsers() {
      this.users.forEach( (user) => {
        if (this.selectedUserIDs.includes(user.id)) {
          user.status = "Disabled";
        }
      });
      this.selectedUserIDs = [];
    },


    deleteSelectedUsers() {
      this.selectedUserIDs.forEach( (id) => {
        this.users.forEach( (user) => {
          if (user.id === id) {
            let index = this.users.indexOf(user);
            if (index > -1) {
              this.users.splice(index, 1);
            }
          }
        });
      });
      this.selectedUserIDs = [];
    },

    checkAll() {
      if(this.users.length !== this.selectedUserIDs.length) {

      
        this.users.forEach( (user) => {
          if(!this.selectedUserIDs.includes(user.id)) {
            this.selectedUserIDs.unshift(user.id);
          }
        });
      } else {
        this.selectedUserIDs = [];
      }
    }


/*
    deleteSelectedUsers() {
      this.users.forEach( (user) => {
        if (this.selectedUserIDs.includes(user.id)) {
          let index = this.users.indexOf(user);
          if (index > -1) {
            this.users.splice(index, 1);
          }
        }
      });
      this.selectedUserIDs = [];
    }
*/
    
    

  },
  computed: {
    actionButtonDisabled() {
      if (Object.keys(this.selectedUserIDs).length === 0) {
        return true;
      } else {
        return false;
      }
    },


    filteredList() {
      let filteredUsers = this.users;
      if (this.filter.firstName != "") {
        filteredUsers = filteredUsers.filter((user) =>
          user.firstName
            .toLowerCase()
            .includes(this.filter.firstName.toLowerCase())
        );
      }
      if (this.filter.lastName != "") {
        filteredUsers = filteredUsers.filter((user) =>
          user.lastName
            .toLowerCase()
            .includes(this.filter.lastName.toLowerCase())
        );
      }
      if (this.filter.username != "") {
        filteredUsers = filteredUsers.filter((user) =>
          user.username
            .toLowerCase()
            .includes(this.filter.username.toLowerCase())
        );
      }
      if (this.filter.emailAddress != "") {
        filteredUsers = filteredUsers.filter((user) =>
          user.emailAddress
            .toLowerCase()
            .includes(this.filter.emailAddress.toLowerCase())
        );
      }
      if (this.filter.status != "") {
        filteredUsers = filteredUsers.filter((user) =>
          user.status === this.filter.status
        );
      }
      return filteredUsers;
    }
  }
};
</script>

<style scoped>
table {
  margin-top: 20px;
  font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, Oxygen,
    Ubuntu, Cantarell, "Open Sans", "Helvetica Neue", sans-serif;
  margin-bottom: 20px;
}
th {
  text-transform: uppercase;
}
td {
  padding: 10px;
}
tr.disabled {
  color: red;
}
input,
select {
  font-size: 16px;
}

form {
  margin: 20px;
  width: 350px;
}
.field {
  padding: 10px 0px;
}
label {
  width: 140px;
  display: inline-block;
}
button {
  margin-right: 5px;
}
.all-actions {
  margin-bottom: 40px;
}
.btn.save {
  margin: 20px;
  float: right;
}
</style>
