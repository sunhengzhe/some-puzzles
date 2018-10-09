const solution = require('../github/fizz');

describe('fizz puzzle', function (){
    describe('3, 5, 7', function () {
        const fizz = solution(3, 5, 7)

        test('rules 2', function () {
            expect(fizz(3)).toEqual('Fizz');
            expect(fizz(5)).toEqual('Buzz');
            expect(fizz(7)).toEqual('Whizz');
        })

        test('rules 3', function () {
            expect(fizz(15)).toEqual('FizzBuzz');
            expect(fizz(21)).toEqual('FizzWhizz');
            expect(fizz(70)).toEqual('BuzzWhizz');
            expect(fizz(105)).toEqual('FizzBuzzWhizz');
        })

        test('rules 4', function () {
            expect(fizz(13)).toEqual('Fizz');
            expect(fizz(35)).toEqual('Fizz');
        })

        test('rules 6', function () {
            expect(fizz(1)).toEqual(1);
        })
    })
});