import pytest

# Create fixture
@pytest.fixture
def num_list():

    # Create list
    
    # Alternatively
    # list = list(range(11))

    return list(range(11))


@pytest.fixture
def wallet_amount():
    amount=0
    return amount