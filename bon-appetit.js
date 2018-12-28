/**
 * Problem
 * 
Complete the bonAppetit function in the editor below. It should print Bon Appetit if the bill is fairly split. Otherwise, it should print the integer amount of money that Brian owes Anna.
bonAppetit has the following parameter(s):
bill: an array of integers representing the cost of each item ordered
k: an integer representing the zero-based index of the item Anna doesn't eat
b: the amount of money that Anna contributed to the bill
 */
function bonAppetit(bill, k, b) {
    let total = 0;
    for (let i = 0; i < bill.length; i++) {
        total += (i != k) ? bill[i] : 0;
    }
    if (total != b * 2) {
        console.log(`${ b - total / 2 }`);
    }
    else {
        console.log("Bon Appetit");
    }
}