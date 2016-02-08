package com;

public class User {
    private String login;
    private String password;
    private Role role;
    private String name;
    private String gender;

    public User(Role role, String password, String login, String name, String gender) {
        this.role = role;
        this.password = password;
        this.login = login;
        this.name = name;
        this.gender = gender;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public Role getRole() {
        return role;
    }

    public String getGender() {
        return gender;
    }
}
