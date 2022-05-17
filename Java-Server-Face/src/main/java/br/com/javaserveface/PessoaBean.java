package br.com.javaserveface;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "pessoaBean")
public class PessoaBean {

    private String name;
    private String lastName;

    public String getName() { return name; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public void setName(String name) { this.name = name; }
}
