#!/usr/bin/env zsh
# Compile all `Solution.java` files into `out/` keeping `common` package compiled.

set -e

OUT_DIR="./out"
mkdir -p "$OUT_DIR"

echo "Compiling common helpers..."
javac -d "$OUT_DIR" $(find common -name "*.java") || true

echo "Finding and compiling all Solution.java files..."
# Find Solution.java files under top-level directories (Easy and Medium + Hard)
files=$(find . -type f -name Solution.java)
if [[ -z "$files" ]]; then
  echo "No Solution.java files found."
  exit 0
fi

for f in $files; do
  echo "Compiling: $f"
  javac -d "$OUT_DIR" -cp "$OUT_DIR" "$f" || {
    echo "Compilation failed for $f" >&2
  }
done

echo "Compilation finished. Classes are in $OUT_DIR"
