package hw.oopTask.learnToStringException.task1;

import java.util.Objects;

public class Account implements Cloneable{
    private String login, pass;
    private boolean prem;

    public Account(String login, String pass, boolean prem) {
        this.login = login;
        this.pass = pass;
        this.prem = prem;
    }

    @Override
    public String toString() {
        return "Account{" +
                "login='" + login + '\'' +
                ", pass='" + pass + '\'' +
                ", prem=" + prem +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return prem == account.prem && Objects.equals(login, account.login) && Objects.equals(pass, account.pass);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, pass, prem);
    }

}
