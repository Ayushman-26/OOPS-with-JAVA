class Person {
    String name;
    Person(String name) {
    this.name = name;
    }
    @Override
    public boolean equals(Object obj) {
    if (this == obj) return true; // Checking reference
    if (obj == null || getClass() != obj.getClass()) return false;
    Person person = (Person) obj;
    return name.equals(person.name);
    }
   }