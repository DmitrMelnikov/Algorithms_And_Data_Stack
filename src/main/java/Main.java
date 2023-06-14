public class Main {

        public static void main(String args[]) {
            Stack stack = new Stack();
            stack.printme();
            stack.push(0);
            stack.printme();
            //'Добавим 1'
            stack.push(1);
            stack.printme();
            //'Добавим 2'
            stack.push(2);
            stack.printme();
            //'Добавим 3'
            stack.push(3);
            stack.printme();
            //'Добавим 4'
            stack.push(4);
            stack.printme();
            //'Добавим 5'
            stack.push(5);
            stack.printme();
            //'Снимем со стека'
            stack.pop();
            stack.printme();
            //'Снимем со стека'
            stack.pop();
            stack.printme();
            //'Снимем со стека'
            stack.pop();
            stack.printme();
            //'Снимем со стека'
            stack.pop();
            stack.printme();
           //'Снимем со стека'
            stack.pop();
            stack.printme();
            //'Снимем со стека'
            stack.pop();
            stack.printme();
        }
    }
