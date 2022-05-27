package com.patterns.behavioral.commandpattern.client;

import com.patterns.behavioral.commandpattern.command.OpenTextFileOperation;
import com.patterns.behavioral.commandpattern.command.SaveTextFileOperation;
import com.patterns.behavioral.commandpattern.command.TextFileOperation;
import com.patterns.behavioral.commandpattern.invoker.TextFileOperationExecutor;
import com.patterns.behavioral.commandpattern.receiver.TextFile;

public class TextFileApplication {
    
    public static void main(String[] args) {
        
        TextFileOperation openTextFileOperation = new OpenTextFileOperation(new TextFile("file1.txt"));
        TextFileOperation saveTextFileOperation = new SaveTextFileOperation(new TextFile("file2.txt"));
        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();
        System.out.println(textFileOperationExecutor.executeOperation(openTextFileOperation));
        System.out.println(textFileOperationExecutor.executeOperation(saveTextFileOperation));
    }   
}