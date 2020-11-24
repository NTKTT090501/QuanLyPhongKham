/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author HA NAM
 */
public class MsgBox {
    //Thông báo cho người dùng
    public static void alert(Component parent, String message){
        JOptionPane.showMessageDialog
        (parent, message,"Hệ thống quản lí Phòng Khám",
        JOptionPane.INFORMATION_MESSAGE);     
    }
    //Thông báo Người Dùng xác nhận
    public static boolean confirm(Component parent, String message){
        int result = JOptionPane.showConfirmDialog
        (parent, message, "Hệ thống quản lí Phòng Khám", 
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return result == JOptionPane.YES_OPTION;
    }
    //Thông báo yêu cầu người dùng nhập vào
    public static String Prompt(Component parent, String message){
        return JOptionPane.showInputDialog
        (parent, message, "Hệ thống quản lí Phòng Khám",
            JOptionPane.INFORMATION_MESSAGE);
    }
}
