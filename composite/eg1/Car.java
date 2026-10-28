package patterns.composite.eg1;

/**
 * Component interface shared by individual cars and car collections.
 */
public interface Car {

  /**
   * Prints this car or the cars contained in this composite.
   */
  void print();

}
