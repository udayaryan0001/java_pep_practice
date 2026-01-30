class SequentialExecution {
    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        {
            @Override
            public void run() {
                printHello();
            }
        }
        Mythread t2 = new Mythread();
        {
            @Override
            public void run() {
                printhi();
            }
        }
        Mythread t3 = new Mythread();vvvvvhhhh
        {
            @Override
            public void run() {
                printName();
            }
        }
        t1.start();
        t2.start();
        t3.start();
    }
}

// class Mythread extends Thread {
// // task first
// void printHello() {
// System.out.println("Hello world");
// }

// // task second
// void printhi() {
// System.err.prin
// tln("hii there");
// }

// // task third
// void printName() {
// System.out.println("hii akash");
// }

// @Override
// public void run() {
// printHello();
// printhi();
// printName();
// }
// }

// // parallelism is only between the threads not between the process
// class ParallelExecution {
// public static void main(String[] args) {
// Mythread mt = new Mythread();
// Thread t1 = new Thread(mt::printHello);
// Thread t2 = new Thread(mt::printhi);
// Thread t3 = new Thread(mt::printName);

// t1.start();
// t2.start();
// t3.start();
// }
// }

// /**
// * Difference:
// * 1. Sequential vs. Parallel: In the 'SequentialExecution' class, each thread
// executes all
// * three tasks sequentially inside its run() method.
// * In 'ParallelExecution', each thread is assigned a specific task (method),
// * allowing the three distinct tasks to run in parallel.
// * 2. Shared Context: 'mt' is a single instance. Using method references
// * (mt::printHello) allows multiple threads to
// * operate on the same object's state, whereas the 'SequentialExecution' class
// created three
// * separate thread objects.
// */

// public class Main {
// public static void main(String[] args) {
// Thread t1 = new Thread(() -> {
// System.out.println("Hello world");
// });
// Thread t2 = new Thread(() -> {
// System.err.println("hii there");
// });
// Thread t3 = new Thread(() -> {
// System.out.println("hii akash");
// });
// t1.start();
// t2.start();
// t3.start();
// }
// }
