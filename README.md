# DataStructures

A Java implementation of core data structures built from scratch using abstract classes and interfaces — a doubly linked list and a binary search tree, sharing a common node design.

![CI](https://github.com/itsmrroot/DataStructures/actions/workflows/ci.yml/badge.svg)

## Overview

This project explores object-oriented design in Java by implementing two different data structures on top of the same abstract building block, `ListItem`. Rather than using Java's built-in collections, every structure here is hand-built: pointer manipulation, traversal, insertion, and deletion are all implemented manually.

## Structure

```
src/main/java/com/company/
├── ListItem.java       # abstract base class (fields, constructor, abstract methods)
├── Node.java            # concrete implementation of ListItem
├── NodeList.java        # interface shared by both data structures
├── MyLinkedList.java     # sorted doubly linked list implementing NodeList
├── SearchTree.java       # binary search tree implementing NodeList
└── Main.java             # entry point / manual testing
```

## Design

- **`ListItem`** (abstract class) — holds two links (`leftLink`, `rightLink`) and a value. Declares `next()`, `previous()`, `setNext()`, `setPrevious()`, and `compareTo()` as package-private abstract methods, to be implemented by subclasses.
- **`Node`** (concrete class) — the only current implementation of `ListItem`, used interchangeably as a linked-list node or a tree node depending on context.
- **`NodeList`** (interface) — a shared contract (`getRoot()`, `addItem()`, `removeItem()`, `traverse()`) implemented separately by both data structures below.
- **`MyLinkedList`** — a sorted doubly linked list. Items are inserted in order using `compareTo()`; `leftLink`/`rightLink` act as previous/next pointers.
- **`SearchTree`** — a binary search tree. The same `leftLink`/`rightLink` fields are reused as left/right children instead. Supports insertion, deletion (including the two-children case via inorder successor), and recursive inorder traversal.

## Running it

```bash
javac com/company/*.java -d out
java -cp out com.company.Main
```

## Continuous integration

Every push to `main` triggers a GitHub Actions workflow that builds the project with Maven on Java 17. See `.github/workflows/ci.yml`.

## Status

🚧 Learning project — built while working through abstract classes, interfaces, and data structure fundamentals in Java. Code and structure may still evolve.
