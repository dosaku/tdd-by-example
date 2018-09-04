from xunit.testcase import TestCase


class WasRun(TestCase):
    def __init__(self, name):
        TestCase.__init__(self, name)
        self.was_run = False
        self.log = None

    def set_up(self):
        self.log = 'set_up '

    def test_method(self):
        self.was_run = True
        self.log = self.log + 'test_method '

    def test_broken_method(self):
        raise Exception

    def tear_down(self):
        self.log = self.log + 'tear_down '
