# ANN

- **Sequential**  
  It is a class in Keras that lets you build a neural network as a linear stack of layers, one after another.  
  Example:
  ```python
  from tensorflow.keras.models import Sequential
  ```

- **Layer Imports**  
  ```python
  from tensorflow.keras.layers import Dense, Flatten, Input
  ```

- **Dense**  
  A fully connected layer where each neuron is connected to every neuron in the previous layer.

- **Flatten**  
  Converts multi-dimensional inputs (e.g. images) into 1D vectors.

- **Input**  
  Defines the shape and type of input data for the model.

***

## Example Model

```python
model = Sequential([
    Input(shape=(4,)),
    Dense(units=4, activation='relu'),
    Dense(units=3, activation='relu'),
    Dense(units=1, activation='linear')
])
```

***

### Explanation

- **Input(shape=(4,))**  
  This model expects input vectors with 4 features.

- **Dense(units=4, activation='relu')**  
  First hidden layer with 4 neurons, using ReLU activation.

***

This structure covers all content and explanations from your handwritten notes in clean Markdown format.

Citations:
[1] 1000298455.jpg https://ppl-ai-file-upload.s3.amazonaws.com/web/direct-files/attachments/images/83101312/78a0efd4-9531-4632-8694-9b1dd5e79d7d/1000298455.jpg?AWSAccessKeyId=ASIA2F3EMEYEXE6MVLZB&Signature=eMJuUREwHvopD%2B9w%2FIU%2BYYp%2BcDE%3D&x-amz-security-token=IQoJb3JpZ2luX2VjECUaCXVzLWVhc3QtMSJHMEUCIQDnJ%2BkaG6G7DCnXoOttA7CO%2FiqnUGOxmV5d2HbDVQzpegIgfjp7cPWZmqXM%2BE8PXhM814KLDvAYLlRQ7uRRG1YZ%2FLcq%2BgQInv%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARABGgw2OTk3NTMzMDk3MDUiDDWaofLxD8dFy%2B9%2FZyrOBMTIGeopHYFBkuWziFpnnKEbZrG5EoJC54cgh9fEdND1lRHgBiREUlX%2F5CWwXM0HZRuRA7pIQgyApH1nNF3ZWkK7oKlWjAtyh7jrBaAMbMtSWqbnrpJ%2B8ZYYlLqO6EGOjT0A1n%2FX%2B0tc87U7HymFn5PQt99GUlAEktngfva0RfIyYibHD3RiN11oF9LNJjpNMBhrgpzw0gCSP04TulLv4TZuLLaVGdqfB0BvqAaZUioelqYq0UC15iMQeSOjKtlanGaIWsFS6tzQSHviLBTZ1bufX7UxMkgTvWuwHVRl8YHRzumrjFoT1LPMk8qWlHHBcvhRoLXc9h%2FF3Xcy4PryFrzyYnirKcclcYGp%2FlSQ%2FmaJcBH9XIr5%2ByG7yGSGxRsD6vhfeIuO4jXdxsknsGHGoIEXat8oQp%2B9pJTD2yjJrDizQMB8pAdFUIRv0a217RPaNORrHSq%2Bm2%2BF44oCD11zg6VNH%2ByLfPuI2EWQWpW04eRPQPKGAq6mBdYKIm9B1bxu3jl9Z5BC2DiKQD4%2FToZmS%2BFQiFhOrRK8ZaSPkWxy23h68H1nFgrxo0wdijkQS0PHwAuAGdl6DENcQHa%2FbHzHtxa%2BS%2B8eQzd23CJOodUnT%2FvdbzC7H6AOUpT%2F8hXDKuMjnLmhVupu7UEt1akMYODd8k6BBhTeKrvdpzMpJqN3NVZm2EDalHu77XN6lV51BAM7IxX8H1k2yndI7up%2BRLuY1h%2FbJOrG7fKqHvE8eIhMFQSxH5yd2LVGP2Nqzj3C35%2FPbMlHjEG8LNCsNLWLA248MIDzqMYGOpoBa%2BbGb%2Fy2AA1egWwWiSZ68RM4l7jhENkwBMNr0TNwaUCAZE21M8iPltrObe82el2pfvv48LFnmTN7j7vHU%2BZNJ%2B3HuvWv%2Fr4X4DOcFe5mXivgEO4HBhhIq5wbrxQUzyKDnGY%2B%2FjVZrhQNwcSEnG5YBQq4aUNAjlnH%2FOqymbyOqWKxnJbD9NqFm7PqI%2BFLFIfeZj1SHu3zHLZL4w%3D%3D&Expires=1758084565
write it in .md format in structured manner

Here is a structured Markdown version of your handwritten ANN notes:

***

# ANN

- **Sequential**  
  It is a class in Keras that lets you build a neural network as a linear stack of layers, one after another.  
  Example:
  ```python
  from tensorflow.keras.models import Sequential
  ```

- **Layer Imports**  
  ```python
  from tensorflow.keras.layers import Dense, Flatten, Input
  ```

- **Dense**  
  A fully connected layer where each neuron is connected to every neuron in the previous layer.

- **Flatten**  
  Converts multi-dimensional inputs (e.g. images) into 1D vectors.

- **Input**  
  Defines the shape and type of input data for the model.

***

## Example Model

```python
model = Sequential([
    Input(shape=(4,)),
    Dense(units=4, activation='relu'),
    Dense(units=3, activation='relu'),
    Dense(units=1, activation='linear')
])
```

***

### Explanation

- **Input(shape=(4,))**  
  This model expects input vectors with 4 features.

- **Dense(units=4, activation='relu')**  
  First hidden layer with 4 neurons, using ReLU activation.


Citations:
[1] 1000298455.jpg https://ppl-ai-file-upload.s3.amazonaws.com/web/direct-files/attachments/images/83101312/78a0efd4-9531-4632-8694-9b1dd5e79d7d/1000298455.jpg?AWSAccessKeyId=ASIA2F3EMEYEXE6MVLZB&Signature=eMJuUREwHvopD%2B9w%2FIU%2BYYp%2BcDE%3D&x-amz-security-token=IQoJb3JpZ2luX2VjECUaCXVzLWVhc3QtMSJHMEUCIQDnJ%2BkaG6G7DCnXoOttA7CO%2FiqnUGOxmV5d2HbDVQzpegIgfjp7cPWZmqXM%2BE8PXhM814KLDvAYLlRQ7uRRG1YZ%2FLcq%2BgQInv%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARABGgw2OTk3NTMzMDk3MDUiDDWaofLxD8dFy%2B9%2FZyrOBMTIGeopHYFBkuWziFpnnKEbZrG5EoJC54cgh9fEdND1lRHgBiREUlX%2F5CWwXM0HZRuRA7pIQgyApH1nNF3ZWkK7oKlWjAtyh7jrBaAMbMtSWqbnrpJ%2B8ZYYlLqO6EGOjT0A1n%2FX%2B0tc87U7HymFn5PQt99GUlAEktngfva0RfIyYibHD3RiN11oF9LNJjpNMBhrgpzw0gCSP04TulLv4TZuLLaVGdqfB0BvqAaZUioelqYq0UC15iMQeSOjKtlanGaIWsFS6tzQSHviLBTZ1bufX7UxMkgTvWuwHVRl8YHRzumrjFoT1LPMk8qWlHHBcvhRoLXc9h%2FF3Xcy4PryFrzyYnirKcclcYGp%2FlSQ%2FmaJcBH9XIr5%2ByG7yGSGxRsD6vhfeIuO4jXdxsknsGHGoIEXat8oQp%2B9pJTD2yjJrDizQMB8pAdFUIRv0a217RPaNORrHSq%2Bm2%2BF44oCD11zg6VNH%2ByLfPuI2EWQWpW04eRPQPKGAq6mBdYKIm9B1bxu3jl9Z5BC2DiKQD4%2FToZmS%2BFQiFhOrRK8ZaSPkWxy23h68H1nFgrxo0wdijkQS0PHwAuAGdl6DENcQHa%2FbHzHtxa%2BS%2B8eQzd23CJOodUnT%2FvdbzC7H6AOUpT%2F8hXDKuMjnLmhVupu7UEt1akMYODd8k6BBhTeKrvdpzMpJqN3NVZm2EDalHu77XN6lV51BAM7IxX8H1k2yndI7up%2BRLuY1h%2FbJOrG7fKqHvE8eIhMFQSxH5yd2LVGP2Nqzj3C35%2FPbMlHjEG8LNCsNLWLA248MIDzqMYGOpoBa%2BbGb%2Fy2AA1egWwWiSZ68RM4l7jhENkwBMNr0TNwaUCAZE21M8iPltrObe82el2pfvv48LFnmTN7j7vHU%2BZNJ%2B3HuvWv%2Fr4X4DOcFe5mXivgEO4HBhhIq5wbrxQUzyKDnGY%2B%2FjVZrhQNwcSEnG5YBQq4aUNAjlnH%2FOqymbyOqWKxnJbD9NqFm7PqI%2BFLFIfeZj1SHu3zHLZL4w%3D%3D&Expires=1758084565
