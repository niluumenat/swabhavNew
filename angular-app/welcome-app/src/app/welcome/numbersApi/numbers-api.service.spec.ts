import { TestBed } from '@angular/core/testing';

import { NumbersApiService } from './numbers-api.service';

describe('NumbersApiService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: NumbersApiService = TestBed.get(NumbersApiService);
    expect(service).toBeTruthy();
  });
});
