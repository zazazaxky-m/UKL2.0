/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry2;

/**
 *
 * @author Zacky
 */

    public interface User {
        public void setNama(String nama);
        public void setAlamat(String alamat);
        public void setTelepon(String telepon);
        
        String getNama(int id);
        String getAlamat(int id);
        String getTelepon(int id);
    }

