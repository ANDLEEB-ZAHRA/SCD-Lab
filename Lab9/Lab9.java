package Lab9;
//refactoring methods
//inline method
public int getRating() {
    return morethanfiverating() ? 2: 1;
}
//inherit relative class(move method /move field)
boolean morethanfiverating(){
    return numberoflatedeliveries > 5; 
}
//safety rules/ precautions / list(encapsulation method)
 public int getrating(){
    return numberoflatedeliveries >5 ?2:1;
 }
 //code smell->Messy in future
 //1
 //Blooters->Too large code/class(all methods in one class)
//Dispensor: //comments(), duplicate() , dead code()
//couplers->bad relationship (move filed method use in it classB continously used classA soo,)
//refactoring concepts (1.extraction(too long methods,print invoice e.g:debit,credit aik hi class me sary methods (clean, readable to reduce it)),
//  2.renaming(int a int b , variabl names ka pta e na ho), 
// 3.querying(method (temporary file me variable rakha hua or agr temporary file misplace ho jaye to code misplace ho jata soo code ko kisi variable me save rakhyn))->logic clean
code of querying: (wrong method quering)
double basePrice=quantity*itemprice;
if(basePrice > 1000){
    return get basePrice * 0.50;
}
Right method:
if (getbasePrice(>1000)){
   return getbasePrice()*0.50;
}
private double getbasePrice(){
    retuen quantity*itemprice;
}