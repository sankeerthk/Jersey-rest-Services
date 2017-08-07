# Jersey-rest-Services


 DO: 1. Write code in java only.
 2. Write JUnit tests to verify all requirements. 
 3. You can use Spring or Jersey framework. If you are not comfortable with either, please use a well-known framework.
 4. Log extensively using standard API. Assume logs will be sent to a central log server. 
 5. Where instructions are unclear or missing, please make your assumptions and explain your rationale. 
 
DO NOT: 1. DO NOT write any UI code, persistence code or security/authentication code 
2. DO NOT use unknown or less popular third party framework or open source libraries. Use your best judgement on what libraries the evaluating person may be aware of. Spring, Log4J and Junit and any common well known libraries are acceptable. 
3. DO NOT copy a previous project and modify. If there are remnants not cleaned up from a different project, this may cause the evaluating person to discredit some of your effort. 
 
Additional points for  1. Code should be production quality. Ensure the code is clean, readable and maintainable. 
2. Use the opportunity to showcase design patterns and best practices and knowledge of latest java technologies. 
 
Scenario/requirements: The company XYZ configures a base price and discounts and promotions for each item sold – 
 Base price (1..1) is the base price at which the item is sold. Any changes to the base price will include an effective date. 
Once the price is changed, it is permanent. New price changes can be staged in the future.  Discount (0..1). 
This is implemented in terms of a percentage off. Discounts will have an effective start and end date and there can be only one Discount price on an item at a time.
 Promotions (0..n). These are set for a group of items with a start+end date. 
The promotion will be applicable only if all the items in the promotion are present in the order. 
This is also implemented in terms of a percentage off. Each promotion will have a weight (An integer number configured for each promotion).
The heavy weight promotions will be applied first. 
 
A sequence is followed when applying the discounts/promotions to arrive at the final price for 
each item Base Price -> Discount -> Promotion 1 -> Promotion 2 -> Promotion 3 and so on. Each discount/promotion is applied 
on the result of the previous calculation. 
 
Example -   The discount is always applied on the base price. 
 The promotion 1 is always applied over the base price if there are no discounts. Assume - No conflicts in weights on promotions. 
 
Write a REST service with one GET operation that will accept a list of itemId’s (in the order) and an “asOf” dateTime,
and return for that dateTime -   The final price on each item  The list of promotions applied for each item 
 The total price on the order 
 
Define your own contract. The prices for all the items can be read from file and stored however you deem necessary in memory. 
Do not use in-memory db with SQL like features. Using cache feature is up to you and not considered necessary for this exercise.
