package kr.ac.kookmin.cs.oop.inheritance;

public class EqualsOverride {
    private String name;
    public EqualsOverride(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public static void main(String[] args) {
        EqualsOverride eo1 = new EqualsOverride("leeky");
        EqualsOverride eo2 = new EqualsOverride("leeky");

        System.out.println(eo1.getName());
        System.out.println(eo2.getName());

        System.out.println(eo1 == eo2);
        System.out.println(eo1.equals(eo2));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof EqualsOverride) {
            EqualsOverride eo = (EqualsOverride) obj;
            return this.name.equals(eo.getName());
        }

        return false;
    }
}
