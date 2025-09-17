import tensorflow as tf
from tensorflow.keras.models import Sequential
from tensorflow.keras.layers import Dense, Flatten
from tensorflow.keras.utils import to_categorical

# Load MNIST dataset
(x_train, y_train), (x_test, y_test) = tf.keras.datasets.mnist.load_data()

# Normalize pixel values
x_train = x_train / 255.0
x_test = x_test / 255.0

# One-hot encode labels
y_train = to_categorical(y_train, 10)
y_test = to_categorical(y_test, 10)

# Model architecture matches your sketch
model = Sequential([
    Flatten(input_shape=(28, 28)),      # Converts 28x28 image to 784-dim vector
    Dense(1024, activation='relu'),     # First hidden layer
    Dense(1024, activation='relu'),     # Second hidden layer
    Dense(512, activation='relu'),      # Third hidden layer
    Dense(10, activation='softmax')     # Output for 10 classes
])

# Compile the model
model.compile(optimizer='adam', loss='categorical_crossentropy', metrics=['accuracy'])

# Train the model
model.fit(x_train, y_train, epochs=5, batch_size=128, validation_split=0.1)

# Evaluate on test data
test_loss, test_acc = model.evaluate(x_test, y_test)
print('Test accuracy:', test_acc)

# Predicting on new image
import numpy as np
dummy_img = np.random.rand(1, 28, 28)
pred = model.predict(dummy_img)
print('Predicted probabilities:', pred)
