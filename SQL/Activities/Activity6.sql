Select DISTINCT salesman_id from orders;
SELECT order_no from orders ORDER BY order_date ASC;
SELECT order_no from orders ORDER BY purchase_amount DESC;
SELECT * from orders where purchase_amount>5000;
SELECT * FROM orders where purchase_amount BETWEEN 1000 and 2000;