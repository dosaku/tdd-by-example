class TestCase:
    def __init__(self, name):
        self.name = name

    def set_up(self):
        pass

    def run(self, result):
        result.test_started()
        self.set_up()
        try:
            method = getattr(self, self.name)
            method()
        except:
            result.test_failed()
        self.tear_down()

    def tear_down(self):
        pass
