package lab_2;

abstract class figure {
    protected String name;
    abstract float GetV();
    abstract float GetS();

    public void GetInfo() {
        System.out.println(name);
    }
}