# Reactive Java Validation plugin.

[***This***](https://gitlab.hayotbank.uz/mobile-back/plugins/general/rjvalidation/-/tree/master/) plugin has been 
created to simplify using [***Java Validation Api***](https://docs.oracle.com/javaee/7/api/javax/validation/package-summary.html)
in the [***reactive***](https://projectreactor.io/) java world.

## Annotations

> For those who are interested in ***"Cm"*** prefix in 
> [***these***](https://gitlab.hayotbank.uz/mobile-back/plugins/general/rjvalidation/-/tree/master/src/main/java/uz/cbssolutions/rjvalidation/constraint) 
> annotations means [***"customized"***](http://acronymsandslang.com/definition/5400387/CM-meaning.html)

> All code samples uses annotations from [***Project Lombok***](https://projectlombok.org/) to simplify code structure.

### [**@CmNotBlank**](https://gitlab.hayotbank.uz/mobile-back/plugins/general/rjvalidation/-/blob/master/src/main/java/uz/cbssolutions/rjvalidation/constraint/CmNotBlank.java)

A [***String***](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) type element annotated with
[***this***](https://gitlab.hayotbank.uz/mobile-back/plugins/general/rjvalidation/-/blob/master/src/main/java/uz/cbssolutions/rjvalidation/constraint/CmNotBlank.java) 
annotation must not be null and must contain at least one non-whitespace character.

```java

import constraint.com.github.israiloff.rjvalidation.CmNotBlank;

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

### [**@CmNotEmpty**](https://gitlab.hayotbank.uz/mobile-back/plugins/general/rjvalidation/-/blob/master/src/main/java/uz/cbssolutions/rjvalidation/constraint/CmNotEmpty.java)

A [***Collection<E>***](https://docs.oracle.com/javase/7/docs/api/java/util/Collection.html) type element annotated
with [***this***](https://gitlab.hayotbank.uz/mobile-back/plugins/general/rjvalidation/-/blob/master/src/main/java/uz/cbssolutions/rjvalidation/constraint/CmNotEmpty.java) annotation must not be null nor empty.

```java

import constraint.com.github.israiloff.rjvalidation.CmNotEmpty;

@AllArgsConstructor
class Foo {

    /**
     * This field must not be null nor empty.
     */
    @CmNotEmpty
    private List<Object> objects;
}
```

### [**@CmNotNull**](https://gitlab.hayotbank.uz/mobile-back/plugins/general/rjvalidation/-/blob/master/src/main/java/uz/cbssolutions/rjvalidation/constraint/CmNotNull.java)

Any element annotated with [***this***](https://gitlab.hayotbank.uz/mobile-back/plugins/general/rjvalidation/-/blob/master/src/main/java/uz/cbssolutions/rjvalidation/constraint/CmNotNull.java) 
annotation must not be null.

```java

import constraint.com.github.israiloff.rjvalidation.CmNotNull;

@AllArgsConstructor
class Foo {

    /**
     * This field must not be null.
     */
    @CmNotNull
    private Object object;
}
```

### [**@CmPattern**](https://gitlab.hayotbank.uz/mobile-back/plugins/general/rjvalidation/-/blob/master/src/main/java/uz/cbssolutions/rjvalidation/constraint/CmPattern.java)

A [***String***](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) type element annotated with
[***this***](https://gitlab.hayotbank.uz/mobile-back/plugins/general/rjvalidation/-/blob/master/src/main/java/uz/cbssolutions/rjvalidation/constraint/CmPattern.java) 
annotation must match to the specified regular expression (regex) or must be null.

```java

import constraint.com.github.israiloff.rjvalidation.CmPattern;

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

### [**@CmSize**](https://gitlab.hayotbank.uz/mobile-back/plugins/general/rjvalidation/-/blob/master/src/main/java/uz/cbssolutions/rjvalidation/constraint/CmSize.java)

A [***String***](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) type element size annotated with
[***this***](https://gitlab.hayotbank.uz/mobile-back/plugins/general/rjvalidation/-/blob/master/src/main/java/uz/cbssolutions/rjvalidation/constraint/CmSize.java) annotation must be between the specified boundaries (included).

```java

import constraint.com.github.israiloff.rjvalidation.CmSize;

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

import constraint.com.github.israiloff.rjvalidation.CmNotBlank;
import constraint.com.github.israiloff.rjvalidation.CmNotEmpty;
import constraint.com.github.israiloff.rjvalidation.CmNotNull;
import constraint.com.github.israiloff.rjvalidation.CmPattern;
import constraint.com.github.israiloff.rjvalidation.CmSize;

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