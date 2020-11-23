/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import Entity.Account;
/**
 *
 * @author HA NAM
 */
public class Auth {
    public static Account user = null; // duy trì user đăng nhập
    
    public static void clear(){// đăng xuất khỏi vai trò hiện tại
        Auth.user = null;
    }
    public static boolean isLogin(){
        return Auth.user != null;
    }
    public static boolean isManage(){// vai trò quản lí
        return Auth.isLogin() && user.getVaiTro();
    }
}
