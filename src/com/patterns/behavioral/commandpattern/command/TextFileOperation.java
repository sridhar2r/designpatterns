package com.patterns.behavioral.commandpattern.command;

@FunctionalInterface
public interface TextFileOperation {
    String execute();
}