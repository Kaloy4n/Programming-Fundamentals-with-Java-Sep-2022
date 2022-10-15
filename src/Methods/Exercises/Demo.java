package Methods.Exercises;

class MyClass{
    // Частни полета:
    private int number;
    private char symbol;
    // Метод с един аргумент за присвояване на стойност
    // на целочисленото поле:
    void set(int n){
        number=n;
    }
    // Метод с един аргумент за присвояване на стойност
    // на символното поле:
    void set(char s){
        symbol=s;
    }
    // Метод с два аргумента за присвояване на стойности
    // на полетата:
    void set(int n,char s){
        // Извикване на версията на метода с един аргумент:
        set(n);
        set(s);
    }
    // Метод за показване стойностите на полетата:
    void show(){
        System.out.println("Полета на обекта");
        System.out.println("Число:  "+number);
        System.out.println("Символ: "+symbol);
    }
}
// Главен клас:
class Demo{
    public static void main(String[] args){
        // Създаване на обект:
        MyClass obj=new MyClass();
        // Операции с обекта:
        obj.set(100,'A');
        obj.show();
        obj.set(200);
        obj.show();
        obj.set('B');
        obj.show();
        // Използване на автоматично преобразуване на типа:
        obj.set('A','D');
        obj.show();
    }
}