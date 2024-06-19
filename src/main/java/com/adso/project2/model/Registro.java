package com.adso.project2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Registro {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    private String name;
    private String last_name;
    private String email;
    private String password;
    private String descript;

    public Registro() {
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getLast_name() {
        return this.last_name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public String getDescript() {
        return this.descript;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setLast_name(final String last_name) {
        this.last_name = last_name;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public void setDescript(final String descript) {
        this.descript = descript;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Registro)) {
            return false;
        } else {
            Registro other = (Registro)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$id = this.getId();
                Object other$id = other.getId();
                if (this$id == null) {
                    if (other$id != null) {
                        return false;
                    }
                } else if (!this$id.equals(other$id)) {
                    return false;
                }

                Object this$name = this.getName();
                Object other$name = other.getName();
                if (this$name == null) {
                    if (other$name != null) {
                        return false;
                    }
                } else if (!this$name.equals(other$name)) {
                    return false;
                }

                Object this$last_name = this.getLast_name();
                Object other$last_name = other.getLast_name();
                if (this$last_name == null) {
                    if (other$last_name != null) {
                        return false;
                    }
                } else if (!this$last_name.equals(other$last_name)) {
                    return false;
                }

                label62: {
                    Object this$email = this.getEmail();
                    Object other$email = other.getEmail();
                    if (this$email == null) {
                        if (other$email == null) {
                            break label62;
                        }
                    } else if (this$email.equals(other$email)) {
                        break label62;
                    }

                    return false;
                }

                label55: {
                    Object this$password = this.getPassword();
                    Object other$password = other.getPassword();
                    if (this$password == null) {
                        if (other$password == null) {
                            break label55;
                        }
                    } else if (this$password.equals(other$password)) {
                        break label55;
                    }

                    return false;
                }

                Object this$descript = this.getDescript();
                Object other$descript = other.getDescript();
                if (this$descript == null) {
                    if (other$descript != null) {
                        return false;
                    }
                } else if (!this$descript.equals(other$descript)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Registro;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        Object $last_name = this.getLast_name();
        result = result * 59 + ($last_name == null ? 43 : $last_name.hashCode());
        Object $email = this.getEmail();
        result = result * 59 + ($email == null ? 43 : $email.hashCode());
        Object $password = this.getPassword();
        result = result * 59 + ($password == null ? 43 : $password.hashCode());
        Object $descript = this.getDescript();
        result = result * 59 + ($descript == null ? 43 : $descript.hashCode());
        return result;
    }

    public String toString() {
        Long var10000 = this.getId();
        return "Registro(id=" + var10000 + ", name=" + this.getName() + ", last_name=" + this.getLast_name() + ", email=" + this.getEmail() + ", password=" + this.getPassword() + ", descript=" + this.getDescript() + ")";
    }
}
