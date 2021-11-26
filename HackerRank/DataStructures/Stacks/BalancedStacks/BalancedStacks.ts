"use strict";

import { WriteStream, createWriteStream } from "fs";
process.stdin.resume();
process.stdin.setEncoding("utf-8");

let inputString: string = "";
let inputLines: string[] = [];
let currentLine: number = 0;

process.stdin.on("data", function (inputStdin: string): void {
  inputString += inputStdin;
});

process.stdin.on("end", function (): void {
  inputLines = inputString.split("\n");
  inputString = "";

  main();
});

function readLine(): string {
  return inputLines[currentLine++];
}

/*
 * Complete the 'isBalanced' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

function isBalanced(s: string): string {
  let fake_stack: string[] = [];
  let dic: {[key: string]: string} = {
    "}": "{",
    "]": "[",
    ")": "("
  };

  for (let bracket of s) {
    if("{[(".includes(bracket)) {
      fake_stack.push(bracket);
    } else if (fake_stack.length != 0 && fake_stack[fake_stack.length - 1].match(dic[bracket])) {
      fake_stack.pop();
    } else {
      return "NO";
    }
  }

  return fake_stack.length != 0 ? "NO" : "YES";
}

function main() {
  const ws: WriteStream = createWriteStream(process.env["OUTPUT_PATH"]);

  const t: number = parseInt(readLine().trim(), 10);

  for (let tItr: number = 0; tItr < t; tItr++) {
    const s: string = readLine();
    const result: string = isBalanced(s);
    ws.write(result + "\n");
  }

  ws.end();
}
