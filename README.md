![Repo-Image](https://massimo.gg/github-images/jkaleidolib.webp)

<div align="center">

# JKaleidolib

![License](https://img.shields.io/github/license/massimo-rnd/jkaleidolib)
![Issues](https://img.shields.io/github/issues/massimo-rnd/jkaleidolib)
![Forks](https://img.shields.io/github/forks/massimo-rnd/jkaleidolib)
![Stars](https://img.shields.io/github/stars/massimo-rnd/jkaleidolib)
![Last Commit](https://img.shields.io/github/last-commit/massimo-rnd/jkaleidolib)
![GitHub release (latest by date including pre-releases)](https://img.shields.io/github/v/release/massimo-rnd/jkaleidolib?include_prereleases)

</div>

## 🚀 Overview

JKaleidolib is a Java library providing different style additions for command line applications. This might sound pretty useless in the first place (probably because it is), but there might be some cases, where colors actually come in handy.

## 🎯 Features

- Colors for Text in your CLI-Application
- Textstyles for Text in your CLI-Application
- Wrapper-Methods for easy usage

## 🛠️ Installation

### Download the latest version

To start off, please head to the [releases page](https://github.com/massimo-rnd/jkaleidolib/releases) and download a pre-built jar.

*If you don't trust me for some reason, feel free to download the latest released source code and build it your self.*

### Import the library to your IDE/project

This process depends on the IDE, so just do it as it is done with your's.

## 💻 Usage

### Using colors
Colors can be used like this:

```java
System.out.println(TextColors.red + "Look at what I can do!" + TextColors.reset);
System.out.println(TextColors.bgred + "Look at what I can do!" + TextColors.reset);
```

### Using styles
Styles can be used like this:

```java
System.out.println(TextStyles.bold + "Look at what I can do!" + TextStyles.reset);
System.out.println(TextColors.underline + "Look at what I can do!" + TextColors.reset);
```

### Alternatively, you can use JKaleidolib's wrapper methods:

Colors:

```java
System.out.println(Color.blue("Ciao!"));
```

Backgrounds:

```java
System.out.println(Background.red("Sain bainuu!"));
```

Formatting:

```java
System.out.println(Formatting.bold("Halo!"));
```

Lining:

```java
System.out.println(Lining.underline("Silaw!"));
```

This way, you can combine several stylings at once very easily:

```java
System.out.println(Background.green(Lining.underline(Color.blue("Ndêwó!"))));
System.out.println(Lining.strikethrough(Color.purple("Yassou!")));
```

## 🚧 Roadmap

- [ ] Implement customizable Colors

Check out the [open issues](https://github.com/massimo-rnd/jkaleidolib/issues) for more.

## 🤝 Contributing

Contributions, issues, and feature requests are welcome!  
Feel free to check the [issues page](https://github.com/massimo-rnd/jkaleidolib/issues).

1. Fork the project.
2. Create your feature branch (`git checkout -b feature/AmazingFeature`).
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`).
4. Push to the branch (`git push origin feature/AmazingFeature`).
5. Open a pull request.

See [CONTRIBUTING.md](CONTRIBUTING.md) for more details.

## 📜 License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## 📊 Repository Metrics

![Repo Size](https://img.shields.io/github/repo-size/massimo-rnd/jkaleidolib)
![Contributors](https://img.shields.io/github/contributors/massimo-rnd/jkaleidolib)
![Commit Activity](https://img.shields.io/github/commit-activity/m/massimo-rnd/jkaleidolib)

---

### 📞 Contact

For any inquiries, feel free to reach out:
- email: [hi@massimo.gg](mailto:hi@massimo.gg)
- X: [massimo-rnd](https://x.com/massimo-rnd)
- [Discord](https://discord.gg/wmC5AA6c)