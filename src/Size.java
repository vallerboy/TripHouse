public enum Size {
    S("small"), M("medium"), L("large"), XL("huge");

    private String fullName;

    private Size(String fullName){
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
