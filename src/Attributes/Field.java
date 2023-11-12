package Attributes;

import com.google.gson.annotations.Expose;


public class Field{
    @Expose
    private String primitive;

    @Expose
    private String name;

    public Field(String name, String primitive) {
        this.name = name;
        this.primitive = primitive;
    }

    /**
     * Description: Gets the name of the primitive type stored in the field.
     * @return - Returns a string with the type of the primitive.
     */
    public String getPrimitive() {
        return this.primitive.replaceAll("[\\[\\]]", "");
    }

    /**
     * Description: Sets the primitive type for a field.
     * @param primitive - The name of the primitive for the field.
     */
    public void setPrimitive(String primitive) {
        this.primitive = primitive;
    }

    /**
     * Description: Gets the name of the field.
     * @return - Returns a string with the name of the field.
     */
    public String getName() {
        return name;
    }

    /**
     * Description: Sets the name of the field.
     * @param name - The new name for the field.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Description: Compares an object to a field to determine if they have the same information.
     * @param o - The object being compared to the field.
     * @return - Returns true if they're the same exact object or if they share the same
     * name and primitive name, returns false if the object is null or not of type field, also returns false
     * if either their names are not the same, their primitives are not the same, or both.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Field field = (Field) o;
        return this.primitive.equals(field.primitive) && this.name.equals(field.name);
    }

    /**
     * Description: Converts the information in the field object into a string.
     * @return - Returns a string with the name and primitive name of the field object.
     */
    @Override
    public String toString() {
        return ( this.name + ": " + this.primitive.replaceAll("[\\[\\]]", ""));
    }
}