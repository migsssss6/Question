import { TestBed } from '@angular/core/testing';

import { LoanService } from './loan.service';

describe('LoanserviceService', () => {
  let service: LoanService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(LoanService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
