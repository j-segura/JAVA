package EdwarActivities;

import EdwarActivities.Services.AccountingService;
import EdwarActivities.Services.BookService;
import EdwarActivities.Services.CircleService;
import EdwarActivities.Services.OperationService;
import EdwarActivities.Services.RectangleService;

public class RunActivity {
    public static void main(String[] args) {

        // Exercise 1
        BookService bookService = new BookService();
        bookService.uploadBook();
        bookService.showBookInfo();
        
        // Exercise 2
        CircleService circleService = new CircleService();
        circleService.createCircle();
        circleService.calculateCircleArea();
        circleService.calculateCirclePerimeter();        

        // Exercise 3
        OperationService operationService = new OperationService();
        operationService.createOperation();
        operationService.add();
        operationService.subtract();
        

        // Exercise 4
        RectangleService rectangleService = new RectangleService();
        rectangleService.createRectangle();
        rectangleService.calculateRectanglePerimeter();
        rectangleService.calculateRectangleArea();
        rectangleService.showRectangle();

        // Exercise 5
        AccountingService accountingService = new AccountingService();
        accountingService.createAccount();
        accountingService.run();

    }
}