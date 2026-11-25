
from selenium import webdriver
from selenium.webdriver.common.by import By

options = webdriver.ChromeOptions()

driver = webdriver.Remote(
    command_executor="http://127.0.0.1:4444",
    options=options
)

driver.set_page_load_timeout(30)

driver.get("http://host.docker.internal:8090")

print("Title:", driver.title)

# Test Case 1: Empty fields
driver.find_element(By.TAG_NAME, "button").click()

alert = driver.switch_to.alert
print("Test 1:", alert.text)
alert.accept()

# Test Case 2: Valid registration
driver.find_element(By.ID, "name").send_keys("Jishnu")
driver.find_element(By.ID, "email").send_keys("jishnu@gmail.com")

driver.find_element(By.TAG_NAME, "button").click()

result = driver.find_element(By.ID, "result").text
print("Test 2:", result)

driver.quit()
