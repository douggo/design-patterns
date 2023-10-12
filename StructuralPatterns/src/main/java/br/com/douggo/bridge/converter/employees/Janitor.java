package br.com.douggo.bridge.converter.employees;

public class Janitor implements IEmployee {

    private final String name;
    private final Integer age;
    private final Double salary;

    public Janitor(String name, Integer age, Double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getAge() {
        return age;
    }

    @Override
    public Double getSalary() {
        return salary;
    }

    public static class Builder {
        private String name;
        private Integer age;
        private Double salary;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Builder salary(Double salary) {
            this.salary = salary;
            return this;
        }

        public Janitor build() {
            return new Janitor(this.name, this.age, this.salary);
        }
    }

}
