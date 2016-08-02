package com.theironyard;

/**
 * Created by jenniferchang on 8/1/16.
 */
public class Email {
    String subject;
    int sentTime;
    String sender;
    String recipient;
    boolean urgent;

    public String getSubject() {
        return subject;
    }

    /* public void setSubject(String subject) {
        if (subject == "") {
            System.err.println("No subject");
        } else {
            this.subject = subject;
        }
    }

    why is this happening?  if i only use one = sign then i get an error, using 2 resolves the error
    -- answer: because comparing, can do either == or != */

    public void setSubject(String subject) {
        if (subject != "") {
            this.subject = subject;
        } else {
            System.err.println("No subject");
        }
    }

    public int getSentTime() {
        return sentTime;
    }

    public void setSentTime (int sentTime) {
        this.sentTime = sentTime;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        if (sender != "") {
            this.sender = sender;
        } else {
            System.err.println("No sender");
        }
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        if (recipient != "") {
            this.recipient = recipient;
        } else {
            System.err.println("No recipient");
        }
    }

    public boolean getUrgent() {
        return urgent;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }













}


