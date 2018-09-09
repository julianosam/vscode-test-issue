package com.vscode.test.issue.vscodetestissue;

import lombok.Builder;

/**
 * 
 * Remove the semi colon from the attribute 'a' in the class below and save the file right away (ctrl+s)
 * The issue seems to happen more frequently if you change and save it real quick, like
 * remove the semi colon and save the file wihthin the same second or less...
 * 
 * When it breaks, code validation and completion stops working completely and can only be restored by
 * restaring VSCode.
 */
@Builder
public class Lombok {

    private String a;

}