package Clases;

public class personas {
    String name, name_last, genere, email, status,address;
    int identification, age, cellphone, phone_fixed,tipo_usuario;

    public personas(int identification,String name, String name_last, int age, String genere,String email,String address, int cellphone, String status, int tipo_usuario) {
        this.name = name;
        this.name_last = name_last;
        this.genere = genere;
        this.email = email;
        this.status = status;
        this.address = address;
        this.identification = identification;
        this.age = age;
        this.cellphone = cellphone;
        this.tipo_usuario = tipo_usuario;
    }

    public personas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName_last() {
        return name_last;
    }

    public void setName_last(String name_last) {
        this.name_last = name_last;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getIdentification() {
        return identification;
    }

    public void setIdentification(int identification) {
        this.identification = identification;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCellphone() {
        return cellphone;
    }

    public void setCellphone(int cellphone) {
        this.cellphone = cellphone;
    }

    public int getPhone_fixed() {
        return phone_fixed;
    }

    public void setPhone_fixed(int phone_fixed) {
        this.phone_fixed = phone_fixed;
    }

    public int getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(int tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }
    
        
    
              
    
}
