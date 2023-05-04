class ContatoInternet extends Contato {
    protected String email;

    public ContatoInternet(){}

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return super.toString() + ", E-mail: " + email;
    }
}
