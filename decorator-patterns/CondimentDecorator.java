abstract class CondimentDecorator extends Beverage {
  Beverage beverage;


  abstract String getDescription();


  abstract double cost();
}
