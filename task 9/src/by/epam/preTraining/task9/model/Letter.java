package by.epam.preTraining.task9.model;

public class Letter extends Symbol{

    public Letter(){}
    public Letter(String string){
        this.string = string;
    }

    public void setLetter(String string) {
        this.string = string;
    }

    public String getLetter() {
        return string;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Letter other = (Letter) obj;
        return this.string.equals(other.string);
    }
}
