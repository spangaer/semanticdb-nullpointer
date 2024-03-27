# Tools

Repo includes a dev container that will provide/install all tools (with correct versions) required
to reproduce the problem. Opening the container is sufficient to be able to run the script.

Required tools are:
- Java 8
- sbt
- bloop

# Scripted

Script to run to reproduce

```
./reproduce
```

# Manual

Commands that above script executes.

## Init

```
sbt clean update bloopInstall
```

## Reproduce

```
bloop exit
bloop clean root
bloop compile root --verbose
```