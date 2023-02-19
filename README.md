# Reactive Java Validation plugin.

[***This***]() plugin has been created to simplify using
[***Java Validation Api***](https://docs.oracle.com/javaee/7/api/javax/validation/package-summary.html)
in the [***reactive***](https://projectreactor.io/) java world.

## Annotations

> For those who are interested in ***"Cm"*** prefix in [***these***]() annotations means [
***"customized"***](http://acronymsandslang.com/definition/5400387/CM-meaning.html)

> All code samples uses annotations from [***Project Lombok***](https://projectlombok.org/) to simplify code structure.

### [**@CmNotBlank**]()

A [***String***](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) type element annotated with
[***this***]() annotation must not be null and must contain at least one non-whitespace character.

```java

import uz.cbssolutions.rjvalidation.constraint.CmNotBlank;

@Data
@AllArgsConstructor
class Foo {

    /**
     * This field must not be null and must contain at least one non-whitespace character.
     */
    @CmNotBlank
    private String text;

} 
```

### [**@CmNotEmpty**]()

A [***Collection<E>***](https://docs.oracle.com/javase/7/docs/api/java/util/Collection.html) type element annotated
with [***this***]() annotation must not be null nor empty.

```java

import uz.cbssolutions.rjvalidation.constraint.CmNotEmpty;

@AllArgsConstructor
class Foo {

    /**
     * This field must not be null nor empty.
     */
    @CmNotEmpty
    private List<Object> objects;
}
```

### [**@CmNotNull**]()

Any element annotated with [***this***]() annotation must not be null.

```java

import uz.cbssolutions.rjvalidation.constraint.CmNotNull;

@AllArgsConstructor
class Foo {

    /**
     * This field must not be null.
     */
    @CmNotNull
    private Object object;
}
```

### [**@CmPattern**]()

A [***String***](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) type element annotated with
[***this***]() annotation must match to the specified regular expression (regex) or must be null.

```java

import uz.cbssolutions.rjvalidation.constraint.CmPattern;

@Data
@AllArgsConstructor
class Foo {

    /**
     * This field must match to the specified regular expression (regex) or must be null.
     */
    @CmPattern(regexp = "^\\w+$")
    private String text;

} 
```

### [**@CmSize**]()

A [***String***](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) type element size annotated with
[***this***]() annotation must be between the specified boundaries (included).

```java

import uz.cbssolutions.rjvalidation.constraint.CmSize;

@Data
@AllArgsConstructor
class Foo {

    /**
     * This field's size must be between 2 and 10 chars (boundaries included) 
     */
    @CmSize(min = 2, max = 10)
    private String text;

} 
```

### A full sample of usage in [***Spring Boot Application***](https://github.com/spring-projects/spring-boot).

#### Model

```java

import uz.cbssolutions.rjvalidation.constraint.CmNotBlank;
import uz.cbssolutions.rjvalidation.constraint.CmNotEmpty;
import uz.cbssolutions.rjvalidation.constraint.CmNotNull;
import uz.cbssolutions.rjvalidation.constraint.CmPattern;
import uz.cbssolutions.rjvalidation.constraint.CmSize;

@Data
@AllArgsConstructor
class Foo {

    @CmNotBlank
    private String notBlankField;

    @CmNotEmpty
    private List<Object> notEmptyField;

    @CmNotNull
    private Object notNullField;

    @CmPattern(regexp = "^\\w+$")
    private String regexMatchField;

    @CmSize(min = 1, max = 20)
    private String text;

}
```

#### Usage

```java

@Component
@Validated
class Context {
    public void usage(@Valid Foo foo) {
        System.out.println(foo);
    }
}
```