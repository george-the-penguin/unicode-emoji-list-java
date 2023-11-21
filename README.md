# unicode-emoji-list-java 😃

`unicode-emoji-list-java` is a comprehensive Java library providing an extensive list of Unicode emojis. This library is 
designed to make working with Unicode emojis in Java applications effortless and intuitive.

## Features 🌟

- **Extensive Emoji Support**: Access a wide range of Unicode emojis.
- **Easy Integration**: Simple setup process for integrating with any Java project.
- **Regular Updates**: Stay up-to-date with the latest emojis as per Unicode standards.

## Getting Started 🚀

To get started with `unicode-emoji-list-java`, follow these steps:

1. **Add the Library to Your Project**:

    ```xml
    <!-- Add this to your project's POM file -->
    <dependency>
        <groupId>dev.georgethepenguin</groupId>
        <artifactId>unicode-emoji-list-java</artifactId>
        <version>1.0.0-v15.1</version>
    </dependency>
    ```

2. **Usage Example**:

    ```java
    import dev.georgethepenguin.unicode.emoji.list.EmojiFaceSmilingSubCategory;

    public class Main {
        public static void main(String[] args) {
            System.out.println("Happy Emoji: " + EmojiFaceSmilingSubCategory.GRINNING_FACE.print());
        }
    }
    ```

## Contributing 🤝

Contributions to `unicode-emoji-list-java` are always welcome!

- Fork the repository
- Create your feature branch (`git checkout -b new-feature`)
- Commit your changes (`git commit -am 'Add some feature'`)
- Push to the branch (`git push origin new-feature`)
- Create a new Pull Request

## License 📄

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments 🙏

- Thanks to everyone who has contributed to this project!
- Special thanks to the [Unicode Consortium](https://home.unicode.org/) for maintaining the Unicode standards.
