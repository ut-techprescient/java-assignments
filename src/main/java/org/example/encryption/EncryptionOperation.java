package org.example.encryption;

import org.example.base.Assignment;

public class EncryptionOperation extends Assignment {

    @Override
    public void execute() {
        String msg = "Enter your choice";
        msg += "\n 1. Encrypt \n 2. Decrypt";
        int choice = this.takeIntegerInput(msg);

        if (choice == 1){
            String rawText = this.takeStringInput("string to encrypt");
            Operation op = new Operation();
            String o = op.encrypt(rawText);
            System.out.println("Encrypted String: " + o);
            return;
        }


        if (choice == 2){
            String rawText = this.takeStringInput("string to decrypt");
            Operation op = new Operation();
            String o = op.decrypt(rawText);
            System.out.println("Decrypted String: " + o);
            return;
        }

        System.out.println("Unidentified Operation");
    }
}
