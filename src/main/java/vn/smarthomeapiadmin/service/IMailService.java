package vn.smarthomeapiadmin.service;

import vn.smarthomeapiadmin.model.MailModel;

public interface IMailService {
    public void sendEmail(MailModel mail);
}
