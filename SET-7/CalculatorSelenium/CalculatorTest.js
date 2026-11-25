
const {Builder, By} = require('selenium-webdriver');

async function test() {

    let driver = await new Builder().forBrowser('MicrosoftEdge').build();

    await driver.get('file:///' + __dirname + '/calculator.html');

    // Test Case 1: Addition
    await driver.findElement(By.id('n1')).sendKeys('20');
    await driver.findElement(By.id('n2')).sendKeys('10');

    await driver.findElement(By.xpath("//button[text()='Add']")).click();

    console.log("Addition:", await driver.findElement(By.id('result')).getText());

    // Test Case 2: Subtraction
    await driver.findElement(By.xpath("//button[text()='Subtract']")).click();

    console.log("Subtraction:", await driver.findElement(By.id('result')).getText());

    await driver.quit();
}

test();
