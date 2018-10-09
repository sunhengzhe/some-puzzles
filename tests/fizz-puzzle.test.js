const fizzPuzzle = require('../github/fizzPuzzle');

describe('fizz puzzle', function () {
    describe('the three special numbers are [3, 5, 7]', function () {
        const countOff = fizzPuzzle(3, 5, 7)

        describe('rules 2', function () {
            test('return Fizz when input is multiple of the first special number', () => {
                expect(countOff(3)).toEqual('Fizz');
            })

            test('return Buzz when input is multiple of the second special number', () => {
                expect(countOff(5)).toEqual('Buzz');
            })

            test('return Whizz when input is multiple of the third special number', () => {
                expect(countOff(7)).toEqual('Whizz');
            })
        })

        describe('rules 3', function () {
            test('return FizzBuzz when input is multiple of both the first and the second special number', () => {
                expect(countOff(15)).toEqual('FizzBuzz');
            })

            test('return FizzWhizz when input is multiple of both the first and the third special number', () => {
                expect(countOff(21)).toEqual('FizzWhizz');
            })

            test('return BuzzWhizz when input is multiple of both the second and the third special number', () => {
                expect(countOff(70)).toEqual('BuzzWhizz');
            })

            test('return FizzBuzzWhizz when input is multiple of all special numbers', () => {
                expect(countOff(105)).toEqual('FizzBuzzWhizz');
            })
        })

        describe('rules 4', function () {
            test('return Fizz when input includes the first special number', function () {
                expect(countOff(13)).toEqual('Fizz');
            })
        })

        describe('rules 5', function () {
            test('the priority of rules 4 is higher then the rules 2 and 3', function () {
                expect(countOff(35)).toEqual('Fizz');
            })
        })

        describe('rules 6', function () {
            test('return the number when none of these conditions is present', function () {
                expect(countOff(1)).toEqual(1);
            })
        })
    })
});