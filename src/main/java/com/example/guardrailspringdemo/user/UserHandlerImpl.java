package com.example.guardrailspringdemo.user;

import org.springframework.stereotype.Component;
import java.util.concurrent.CompletionStage;

@Component
class UserHandlerImpl implements UserHandler {
    public CompletionStage<UserHandler.CreateUserResponse> createUser(
            final com.example.guardrailspringdemo.definitions.User body) {
        return null;
    }

    public CompletionStage<UserHandler.CreateUsersWithArrayInputResponse> createUsersWithArrayInput(
            final java.util.List<com.example.guardrailspringdemo.definitions.User> body) {
        return null;
    }

    public CompletionStage<UserHandler.CreateUsersWithListInputResponse> createUsersWithListInput(
            final java.util.List<com.example.guardrailspringdemo.definitions.User> body) {
        return null;
    }

    public CompletionStage<UserHandler.LoginUserResponse> loginUser(final String username, final String password) {
        return null;
    }

    public CompletionStage<UserHandler.LogoutUserResponse> logoutUser() {
        return null;
    }

    public CompletionStage<UserHandler.GetUserByNameResponse> getUserByName(final String username) {
        return null;
    }

    public CompletionStage<UserHandler.UpdateUserResponse> updateUser(final String username,
            final com.example.guardrailspringdemo.definitions.User body) {
        return null;
    }

    public CompletionStage<UserHandler.DeleteUserResponse> deleteUser(final String username) {
        return null;
    }
}
